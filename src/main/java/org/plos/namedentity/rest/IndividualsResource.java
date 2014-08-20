package org.plos.namedentity.rest;

import org.plos.namedentity.api.EntityNotFoundException;
import org.plos.namedentity.api.NedValidationException;
import org.plos.namedentity.api.entity.AddressEntity;
import org.plos.namedentity.api.entity.DegreeEntity;
import org.plos.namedentity.api.entity.EmailEntity;
import org.plos.namedentity.api.entity.IndividualEntity;
import org.plos.namedentity.api.entity.PhonenumberEntity;
import org.plos.namedentity.api.entity.RoleEntity;
import org.plos.namedentity.api.entity.UniqueidentifierEntity;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/individuals")
public class IndividualsResource extends BaseResource {

  @POST
  public Response create(IndividualEntity entity) {
    try {
      namedEntityService.resolveValuesToIds(entity);

      Integer nedId = crudService.create(entity);

      return Response.status(Response.Status.OK).entity(
          namedEntityService.findResolvedEntity(nedId, IndividualEntity.class)).build();

    } catch (NedValidationException e) {
      return validationError(e, "Unable to create individual");
    } catch (Exception e) {
      return serverError(e, "Unable to create individual");
    }
  }

  @GET
  @Path("/{id}")
  public Response read(@PathParam("id") int nedId) {
    try {
      IndividualEntity individual = namedEntityService.findResolvedEntity(nedId, IndividualEntity.class);
      return Response.status(Response.Status.OK).entity(individual).build();
    }
    catch(Exception e) {
      return serverError(e, "Find individual by id failed");
    }
  }

  @POST
  @Path("/{id}")
  public Response update(@PathParam("id") int nedId, IndividualEntity entity) {

    try {

      entity.setNamedentityid(nedId);  // TODO: check if path var=payload for id?

      namedEntityService.resolveValuesToIds(entity);

      crudService.update(entity);

      entity = namedEntityService.findResolvedEntity(nedId, IndividualEntity.class);

      return Response.ok().entity(entity).build();

    } catch (EntityNotFoundException e) {
      return entityNotFound(e);
    } catch (Exception e) {
      return serverError(e, "Unable to update individual");
    }

  }

  @DELETE
  @Path("/{id}")
  public Response delete(@PathParam("id") int nedId) {

    try {

      IndividualEntity entity = namedEntityService.findResolvedEntity(nedId, IndividualEntity.class);

      crudService.delete(entity);

      return Response.status(Response.Status.NO_CONTENT).build();

    } catch (EntityNotFoundException e) {
      return entityNotFound(e);
    } catch (Exception e) {
      return serverError(e, "Unable to delete individual");
    }

  }

  @GET
  public Response list(@QueryParam("uidType") String uidType, @QueryParam("uidValue") String uidValue) {
    try {
      List<IndividualEntity> individuals = null; 
      
      if (isEmptyOrBlank(uidType) || isEmptyOrBlank(uidValue)) {
        individuals = crudService.findAll(IndividualEntity.class);
      } else {
        individuals = namedEntityService.findResolvedEntityByUid(uidType, uidValue, IndividualEntity.class);
      }
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<IndividualEntity>>(individuals){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find all individuals failed");
    }
  }


  /* ----------------------------------------------------------------------- */
  /*  EMAIL CRUD                                                             */
  /* ----------------------------------------------------------------------- */

  @POST
  @Path("/{nedId}/emails")
  public Response createEmail(@PathParam("nedId") int nedId, EmailEntity emailEntity) {
    try {
      emailEntity.setNamedentityid(nedId);

      namedEntityService.resolveValuesToIds(emailEntity);

      Integer emailId = crudService.create(emailEntity);

      return Response.status(Response.Status.OK).entity(
          namedEntityService.findResolvedEntityByKey(emailId, EmailEntity.class)).build();
    }
    catch(NedValidationException e) {
      return validationError(e, "Unable to create email");
    }
    catch(Exception e) {
      return serverError(e, "Unable to create email");
    }
  }

  @POST
  @Path("/{nedId}/emails/{emailId}")
  public Response updateEmail(@PathParam("nedId") int nedId, 
                              @PathParam("emailId") int emailId, 
                              EmailEntity emailEntity) {
    try {
      emailEntity.setNamedentityid(nedId);

      namedEntityService.resolveValuesToIds(emailEntity);

      crudService.update(emailEntity);

      emailEntity = namedEntityService.findResolvedEntityByKey(emailId, EmailEntity.class);

      return Response.status(Response.Status.OK).entity(emailEntity).build();
    }
    catch(NedValidationException e) {
      return validationError(e, "Unable to update email");
    }
    catch(Exception e) {
      return serverError(e, "Unable to update email");
    }
  }

  @DELETE
  @Path("/{nedId}/emails/{emailId}")
  public Response deleteEmail(@PathParam("nedId") int nedId, 
                              @PathParam("emailId") int emailId) {
    try {
      EmailEntity emailEntity = namedEntityService.findResolvedEntityByKey(emailId, EmailEntity.class);

      crudService.delete(emailEntity);

      return Response.status(Response.Status.NO_CONTENT).build();
    }
    catch(NedValidationException e) {
      return validationError(e, "Unable to delete email");
    }
    catch(Exception e) {
      return serverError(e, "Unable to delete email");
    }
  }

  @GET
  @Path("/{nedId}/emails/{emailId}")
  public Response getEmail(@PathParam("nedId") int nedId, @PathParam("emailId") int emailId) {
    try {

      List<EmailEntity> emails = namedEntityService.findResolvedEntities(nedId, EmailEntity.class);

      if (emails.size() == 0)
        return entityNotFound("Individual not found");

      for (EmailEntity email : emails)
        if (email.getEmailid().equals(emailId))
          return Response.status(Response.Status.OK).entity(email).build();

      return entityNotFound("Email not found");

    } catch (Exception e) {
      return serverError(e, "Find email by id failed");
    }
  }

  @GET
  @Path("/{id}/emails")
  public Response getEmails(@PathParam("id") int nedId) {
    try {

      // make sure the nedId belongs to an individual
      namedEntityService.findResolvedEntity(nedId, IndividualEntity.class);

      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<EmailEntity>>(
              namedEntityService.findResolvedEntities(nedId, EmailEntity.class)
          ) {
          }).build();
    } catch (EntityNotFoundException e) {
      return entityNotFound(e);
    } catch (Exception e) {
      return serverError(e, "Find emails by nedId failed");
    }
  }

  @GET
  @Path("/{id}/degrees")
  public Response getDegrees(@PathParam("id") int nedId) {
    try {
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<DegreeEntity>>(
              namedEntityService.findResolvedEntities(
                  nedId, DegreeEntity.class)){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find degrees by nedId failed");
    }
  }

  @GET
  @Path("/{id}/addresses")
  public Response getAddresses(@PathParam("id") int nedId) {
    try {
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<AddressEntity>>(
              namedEntityService.findResolvedEntities(
                  nedId, AddressEntity.class)
          ){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find addresses by nedId failed");
    }
  }

  @GET
  @Path("/{id}/phonenumbers")
  public Response getPhonenumbers(@PathParam("id") int nedId) {
    try {
      List<PhonenumberEntity> phonenumbers = namedEntityService.findResolvedEntities(nedId, PhonenumberEntity.class);
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<PhonenumberEntity>>(phonenumbers){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find phone numberse by nedId failed");
    }
  }

  @GET
  @Path("/{id}/roles")
  public Response getRoles(@PathParam("id") int nedId) {
    try {
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<RoleEntity>>(
              namedEntityService.findResolvedEntities(nedId, RoleEntity.class)
          ){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find roles by nedId failed");
    }
  }

  @GET
  @Path("/{id}/xref")
  public Response getExternalReferences(@PathParam("id") int nedId) {
    try {
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<UniqueidentifierEntity>>(
              namedEntityService.findResolvedEntities(nedId, UniqueidentifierEntity.class)
          ){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find external references by nedId failed");
    }
  }

}
