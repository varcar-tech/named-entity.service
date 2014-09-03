package org.plos.namedentity.rest;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.plos.namedentity.api.EntityNotFoundException;
import org.plos.namedentity.api.NedValidationException;
import org.plos.namedentity.api.entity.Address;
import org.plos.namedentity.api.entity.Degree;
import org.plos.namedentity.api.entity.Email;
import org.plos.namedentity.api.entity.Individual;
import org.plos.namedentity.api.entity.Phonenumber;
import org.plos.namedentity.api.entity.Role;
import org.plos.namedentity.api.entity.Uniqueidentifier;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/individuals")
@Api(value="/individuals")
public class IndividualsResource extends BaseResource {

  @POST
  @ApiOperation(value = "Create", response = Individual.class)
  public Response create(Individual entity) {
    try {
      namedEntityService.resolveValuesToIds(entity);

      Integer nedId = crudService.create(entity);

      return Response.status(Response.Status.OK).entity(
          namedEntityService.findResolvedEntity(nedId, Individual.class)
                                                       ).build();

    } catch (NedValidationException e) {
      return validationError(e, "Unable to create individual");
    } catch (Exception e) {
      return serverError(e, "Unable to create individual");
    }
  }

  @GET
  @Path("/{nedId}")
  @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
  @ApiOperation(value = "Read", response = Individual.class)
  public Response read(@PathParam("nedId") int nedId) {
    try {
      return Response.status(Response.Status.OK).entity(
          namedEntityService.findResolvedEntity(nedId, Individual.class)
                                                       ).build();
    } catch (EntityNotFoundException e) {
      return entityNotFound(e);
    } catch (Exception e) {
      return serverError(e, "Find individual by id failed");
    }
  }

  @POST
  @Path("/{nedId}")
  @ApiOperation(value = "Update", response = Individual.class)
  public Response update(@PathParam("nedId") int nedId, Individual entity) {

    try {

      entity.setNamedentityid(nedId);  // TODO: check if path var=payload for id?

      namedEntityService.resolveValuesToIds(entity);

      crudService.update(entity);

      entity = namedEntityService.findResolvedEntity(nedId, Individual.class);

      return Response.ok().entity(entity).build();

    } catch (EntityNotFoundException e) {
      return entityNotFound(e);
    } catch (Exception e) {
      return serverError(e, "Unable to update individual");
    }

  }

  @DELETE
  @Path("/{nedId}")
  @ApiOperation(value = "Delete")
  public Response delete(@PathParam("nedId") int nedId) {

    try {

      Individual entity = namedEntityService.findResolvedEntity(nedId, Individual.class);

      crudService.delete(entity);

      return Response.status(Response.Status.NO_CONTENT).build();

    } catch (EntityNotFoundException e) {
      return entityNotFound(e);
    } catch (Exception e) {
      return serverError(e, "Unable to delete individual");
    }

  }

  @GET
  @ApiOperation(value = "List")
  public Response list(@QueryParam("uidType") String uidType,
                       @QueryParam("uidValue") String uidValue) {
    try {
      List<Individual> individuals = null;
      
      if (isEmptyOrBlank(uidType) || isEmptyOrBlank(uidValue)) {
        individuals = crudService.findAll(Individual.class);
      } else {
        individuals = namedEntityService.findResolvedEntityByUid(
            uidType, uidValue, Individual.class);
      }
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<Individual>>(individuals){}).build();
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
  @ApiOperation(value = "Create email", response = Email.class)
  public Response createEmail(@PathParam("nedId") int nedId,
                              Email emailEntity) {
    return createEntity(nedId, emailEntity, Individual.class);
  }

  @POST
  @Path("/{nedId}/emails/{emailId}")
  @ApiOperation(value = "Update email", response = Email.class)
  public Response updateEmail(@PathParam("nedId") int nedId, 
                              @PathParam("emailId") int emailId, 
                              Email emailEntity) {
    return updateEntity(nedId, emailId, emailEntity, Individual.class);
  }

  @DELETE
  @Path("/{nedId}/emails/{emailId}")
  @ApiOperation(value = "Delete email")
  public Response deleteEmail(@PathParam("nedId") int nedId, 
                              @PathParam("emailId") int emailId) {
    return deleteEntity(nedId, emailId, Email.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/emails/{emailId}")
  @ApiOperation(value = "Read email", response = Email.class)
  public Response getEmail(@PathParam("nedId") int nedId,
                           @PathParam("emailId") int emailId) {
    return getEntity(nedId, emailId, Email.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/emails")
  @ApiOperation(value = "List emails")
  public Response getEmails(@PathParam("nedId") int nedId) {
    return getEntities(nedId, Email.class, Individual.class);
  }

  /* ----------------------------------------------------------------------- */
  /*  ADDRESS CRUD                                                           */
  /* ----------------------------------------------------------------------- */

  @POST
  @Path("/{nedId}/addresses")
  @ApiOperation(value = "Create address", response = Address.class)
  public Response createAddress(@PathParam("nedId") int nedId,
                                Address addressEntity) {
    return createEntity(nedId, addressEntity, Individual.class);
  }

  @POST
  @Path("/{nedId}/addresses/{addressId}")
  @ApiOperation(value = "Update address", response = Address.class)
  public Response updateAddress(@PathParam("nedId") int nedId, 
                                @PathParam("addressId") int addressId, 
                                Address addressEntity) {
    return updateEntity(nedId, addressId, addressEntity, Individual.class);
  }

  @DELETE
  @Path("/{nedId}/addresses/{addressId}")
  @ApiOperation(value = "Delete address")
  public Response deleteAddress(@PathParam("nedId") int nedId, 
                                @PathParam("addressId") int addressId) {
    return deleteEntity(nedId, addressId, Address.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/addresses/{addressId}")
  @ApiOperation(value = "Read address", response = Address.class)
  public Response getAddress(@PathParam("nedId") int nedId,
                             @PathParam("addressId") int addressId) {
    return getEntity(nedId, addressId, Address.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/addresses")
  @ApiOperation(value = "List addresses")
  public Response getAddresss(@PathParam("nedId") int nedId) {
    return getEntities(nedId, Address.class, Individual.class);
  }

  /* ----------------------------------------------------------------------- */
  /*  PHONE NUMBER CRUD                                                      */
  /* ----------------------------------------------------------------------- */

  @GET
  @Path("/{nedId}/phonenumbers")
  @ApiOperation(value = "List phone numbers")
  public Response getPhonenumbers(@PathParam("nedId") int nedId) {
    return getEntities(nedId, Phonenumber.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/xref")
  @ApiOperation(value = "List references")
  public Response getExternalReferences(@PathParam("nedId") int nedId) {
    return getEntities(nedId, Uniqueidentifier.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/degrees")
  @ApiOperation(value = "List degrees")
  public Response getDegrees(@PathParam("nedId") int nedId) {
    try {
      return Response.status(Response.Status.OK).entity(
          new GenericEntity<List<Degree>>(
              namedEntityService.findResolvedEntities(
                  nedId, Degree.class)){}).build();
    }
    catch(Exception e) {
      return serverError(e, "Find degrees by nedId failed");
    }
  }

  /* ----------------------------------------------------------------------- */
  /*  ROLE CRUD                                                              */
  /* ----------------------------------------------------------------------- */

  @POST
  @Path("/{nedId}/roles")
  @ApiOperation(value = "Create role", response = Role.class)
  public Response createRole(@PathParam("nedId") int nedId, Role roleEntity) {
    return createEntity(nedId, roleEntity, Individual.class);
  }

  @POST
  @Path("/{nedId}/roles/{roleId}")
  @ApiOperation(value = "Update role", response = Role.class)
  public Response updateRole(@PathParam("nedId") int nedId, 
                             @PathParam("roleId") int roleId, 
                             Role roleEntity) {
    return updateEntity(nedId, roleId, roleEntity, Individual.class);
  }

  @DELETE
  @Path("/{nedId}/roles/{roleId}")
  @ApiOperation(value = "Delete role")
  public Response deleteRole(@PathParam("nedId") int nedId, 
                             @PathParam("roleId") int roleId) {
    return deleteEntity(nedId, roleId, Role.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/roles/{roleId}")
  @ApiOperation(value = "Read role", response = Role.class)
  public Response getRole(@PathParam("nedId") int nedId,
                          @PathParam("roleId") int roleId) {
    return getEntity(nedId, roleId, Role.class, Individual.class);
  }

  @GET
  @Path("/{nedId}/roles")
  @ApiOperation(value = "List roles")
  public Response getRoles(@PathParam("nedId") int nedId) {
    return getEntities(nedId, Role.class, Individual.class);
  }
}
