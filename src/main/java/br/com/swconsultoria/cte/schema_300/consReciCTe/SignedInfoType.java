
package br.com.swconsultoria.cte.schema_300.consReciCTe;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de SignedInfoType complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * <complexType name="SignedInfoType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CanonicalizationMethod">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://www.w3.org/TR/2001/REC-xml-c14n-20010315" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="SignatureMethod">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://www.w3.org/2000/09/xmldsig#rsa-sha1" />
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Reference" type="{http://www.w3.org/2000/09/xmldsig#}ReferenceType"/>
 *       </sequence>
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedInfoType", propOrder = {
        "canonicalizationMethod",
        "signatureMethod",
        "reference"
})
public class SignedInfoType {

    @XmlElement(name = "CanonicalizationMethod", required = true)
    protected CanonicalizationMethod canonicalizationMethod;
    @XmlElement(name = "SignatureMethod", required = true)
    protected SignatureMethod signatureMethod;
    @XmlElement(name = "Reference", required = true)
    protected ReferenceType reference;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtém o valor da propriedade canonicalizationMethod.
     *
     * @return possible object is
     * {@link CanonicalizationMethod }
     */
    public CanonicalizationMethod getCanonicalizationMethod() {
        return canonicalizationMethod;
    }

    /**
     * Define o valor da propriedade canonicalizationMethod.
     *
     * @param value allowed object is
     *              {@link CanonicalizationMethod }
     */
    public void setCanonicalizationMethod(CanonicalizationMethod value) {
        this.canonicalizationMethod = value;
    }

    /**
     * Obtém o valor da propriedade signatureMethod.
     *
     * @return possible object is
     * {@link SignatureMethod }
     */
    public SignatureMethod getSignatureMethod() {
        return signatureMethod;
    }

    /**
     * Define o valor da propriedade signatureMethod.
     *
     * @param value allowed object is
     *              {@link SignatureMethod }
     */
    public void setSignatureMethod(SignatureMethod value) {
        this.signatureMethod = value;
    }

    /**
     * Obtém o valor da propriedade reference.
     *
     * @return possible object is
     * {@link ReferenceType }
     */
    public ReferenceType getReference() {
        return reference;
    }

    /**
     * Define o valor da propriedade reference.
     *
     * @param value allowed object is
     *              {@link ReferenceType }
     */
    public void setReference(ReferenceType value) {
        this.reference = value;
    }

    /**
     * Obtém o valor da propriedade id.
     *
     * @return possible object is
     * {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://www.w3.org/TR/2001/REC-xml-c14n-20010315" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CanonicalizationMethod {

        @XmlAttribute(name = "Algorithm", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String algorithm;

        /**
         * Obtém o valor da propriedade algorithm.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAlgorithm() {
            if (algorithm == null) {
                return "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
            } else {
                return algorithm;
            }
        }

        /**
         * Define o valor da propriedade algorithm.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAlgorithm(String value) {
            this.algorithm = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <attribute name="Algorithm" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" fixed="http://www.w3.org/2000/09/xmldsig#rsa-sha1" />
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SignatureMethod {

        @XmlAttribute(name = "Algorithm", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String algorithm;

        /**
         * Obtém o valor da propriedade algorithm.
         *
         * @return possible object is
         * {@link String }
         */
        public String getAlgorithm() {
            if (algorithm == null) {
                return "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
            } else {
                return algorithm;
            }
        }

        /**
         * Define o valor da propriedade algorithm.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setAlgorithm(String value) {
            this.algorithm = value;
        }

    }

}
