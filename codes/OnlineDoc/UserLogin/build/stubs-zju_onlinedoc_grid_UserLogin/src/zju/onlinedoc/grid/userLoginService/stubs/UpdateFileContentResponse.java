/**
 * UpdateFileContentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC2 Nov 14, 2006 (10:23:53 EST) WSDL2Java emitter.
 */

package zju.onlinedoc.grid.userLoginService.stubs;

public class UpdateFileContentResponse  implements java.io.Serializable {
    private boolean updateFileContentReturn;

    public UpdateFileContentResponse() {
    }

    public UpdateFileContentResponse(
           boolean updateFileContentReturn) {
           this.updateFileContentReturn = updateFileContentReturn;
    }


    /**
     * Gets the updateFileContentReturn value for this UpdateFileContentResponse.
     * 
     * @return updateFileContentReturn
     */
    public boolean isUpdateFileContentReturn() {
        return updateFileContentReturn;
    }


    /**
     * Sets the updateFileContentReturn value for this UpdateFileContentResponse.
     * 
     * @param updateFileContentReturn
     */
    public void setUpdateFileContentReturn(boolean updateFileContentReturn) {
        this.updateFileContentReturn = updateFileContentReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateFileContentResponse)) return false;
        UpdateFileContentResponse other = (UpdateFileContentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.updateFileContentReturn == other.isUpdateFileContentReturn();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isUpdateFileContentReturn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateFileContentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zju.edu/onlinedoc/grid/userlogin/UserLogin", ">updateFileContentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateFileContentReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zju.edu/onlinedoc/grid/userlogin/UserLogin", "updateFileContentReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
