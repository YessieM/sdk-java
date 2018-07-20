package net.authorize.data.cim;

import java.io.Serializable;
import java.util.ArrayList;

import net.authorize.data.xml.Address;
import javax.xml.bind.annotation.XmlRootElement;

/**
*
* @deprecated since version 1.9.8
* @deprecated We have reorganized and simplified the Authorize.Net API to ease integration and to focus on merchants' needs.
* @deprecated We have deprecated AIM, ARB, CIM, and Reporting as separate options, in favor of AuthorizeNet::API.
* @deprecated We have also deprecated SIM as a separate option, in favor of Accept Hosted. See https://developer.authorize.net/api/reference/features/accept_hosted.html for details on Accept Hosted.
* @deprecated For details on AIM, see https://github.com/AuthorizeNet/sample-code-php/tree/master/PaymentTransactions.
* @deprecated For details on the deprecation and replacement of legacy Authorize.Net methods, visit https://developer.authorize.net/api/upgrade_guide/.
*
*/
@Deprecated
@XmlRootElement
public class CustomerProfile implements Serializable {
	private static final long serialVersionUID = 1L;
	
	protected String merchantCustomerId;
    protected String description;
    protected String email;
    protected String customerProfileId;
    protected ArrayList<Address> shipToAddressList = new ArrayList<Address>();

    private CustomerProfile() { }

    /**
     * Create a new CustomerProfile object
     *
     * @return CustomerProfile
     */
    public static CustomerProfile createCustomerProfile() {
    	return new CustomerProfile();
    }

    /**
     * Get the customer profile id.
     *
	 * @return the id
	 */
	public String getCustomerProfileId() {
		return customerProfileId;
	}

	/**
	 * Set the customer profile id.
	 *
	 * @param id the id to set
	 */
	public void setCustomerProfileId(String id) {
		this.customerProfileId = id;
	}

	/**
     * Gets the value of the merchantCustomerId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMerchantCustomerId() {
        return merchantCustomerId;
    }

    /**
     * Sets the value of the merchantCustomerId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMerchantCustomerId(String value) {
        this.merchantCustomerId = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmail(String value) {
        this.email = value;
    }

	/**
	 * @return the shipToAddressList
	 */
	public ArrayList<Address> getShipToAddressList() {
		return shipToAddressList;
	}

	/**
	 * @param shipToAddressList the shipToAddressList to set
	 */
	public void setShipToAddressList(ArrayList<Address> shipToAddressList) {
		this.shipToAddressList = shipToAddressList;
	}

	/**
	 * Add an address to the ship to list.
	 *
	 * @param shipTo
	 */
	public void addShipToAddress(Address shipTo) {
		if(this.shipToAddressList == null) {
			this.shipToAddressList = new ArrayList<Address>();
		}

		this.shipToAddressList.add(shipTo);
	}

	/**
	 * Return the first (perhaps only) address in the list.
	 *
	 * @return Address
	 */
	public Address getShipToAddress() {

		Address retval = null;
		if(this.shipToAddressList != null &&
				this.shipToAddressList.size() > 0) {

			retval = this.shipToAddressList.get(0);
		}

		return retval;
	}
}
