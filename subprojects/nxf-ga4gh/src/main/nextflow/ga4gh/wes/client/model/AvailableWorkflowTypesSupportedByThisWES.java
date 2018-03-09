/*
 * workflow_execution.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package nextflow.ga4gh.wes.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * AvailableWorkflowTypesSupportedByThisWES
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-01T15:34:23.960Z")
public class AvailableWorkflowTypesSupportedByThisWES {
  @SerializedName("workflow_type_version")
  private List<String> workflowTypeVersion = null;

  public AvailableWorkflowTypesSupportedByThisWES workflowTypeVersion(List<String> workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
    return this;
  }

  public AvailableWorkflowTypesSupportedByThisWES addWorkflowTypeVersionItem(String workflowTypeVersionItem) {
    if (this.workflowTypeVersion == null) {
      this.workflowTypeVersion = new ArrayList<String>();
    }
    this.workflowTypeVersion.add(workflowTypeVersionItem);
    return this;
  }

   /**
   * Get workflowTypeVersion
   * @return workflowTypeVersion
  **/
  @ApiModelProperty(value = "")
  public List<String> getWorkflowTypeVersion() {
    return workflowTypeVersion;
  }

  public void setWorkflowTypeVersion(List<String> workflowTypeVersion) {
    this.workflowTypeVersion = workflowTypeVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableWorkflowTypesSupportedByThisWES availableWorkflowTypesSupportedByThisWES = (AvailableWorkflowTypesSupportedByThisWES) o;
    return Objects.equals(this.workflowTypeVersion, availableWorkflowTypesSupportedByThisWES.workflowTypeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowTypeVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableWorkflowTypesSupportedByThisWES {\n");
    
    sb.append("    workflowTypeVersion: ").append(toIndentedString(workflowTypeVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
