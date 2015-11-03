package org.plos.ned_client.model;

import org.plos.ned_client.StringUtil;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-03T14:45:36.898-08:00")
public class ConfigInfo   {
  
  private String version = null;
  private Date startime = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("startime")
  public Date getStartime() {
    return startime;
  }
  public void setStartime(Date startime) {
    this.startime = startime;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigInfo {\n");
    
    sb.append("    version: ").append(StringUtil.toIndentedString(version)).append("\n");
    sb.append("    startime: ").append(StringUtil.toIndentedString(startime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}