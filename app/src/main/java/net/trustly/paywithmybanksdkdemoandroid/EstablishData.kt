package net.trustly.paywithmybanksdkdemoandroid

object EstablishData {

    fun getEstablishDataValues(): Map<String, String> {
        val establishDataValues: MutableMap<String, String> = HashMap()

        /**
         * {
        "accessId":"WS8vT7ftpHImaeLB5FSx",
        "merchantId":"1051",
        "merchantReference":"1681227767115|geh-oB97lH5UJkqegyDwLJP9yP-O7J4eeDR6ou6qUETa88tvIgMeeT2APZ_Ei-rr",
        "paymentType":"Deferred",
        "customer.customerId":"19019",
        "customer.externalId":"19019",
        "customer.name":"trustly six",
        "customer.taxId":"crypt:PFGGs/S4v1v9zrZ7lpYgQY365nRmySF1Sd7zawdEjVc=",
        "customer.address.address1":"1101 East Gibbsboro Road ",
        "customer.address.city":"Lindenwold",
        "customer.address.state":"NJ",
        "customer.address.zip":"08021",
        "customer.address.country":"US",
        "customer.phone":"+16575675675",
        "customer.email":"trustly006@yopmail.com",
        "customer.dateOfBirth":"1985-01-01"
        }
         */
        establishDataValues["accessId"] = "WS8vT7ftpHImaeLB5FSx"
        establishDataValues["merchantId"] = "1051"
        establishDataValues["customer.merchantId"] = "1051"
        //establishDataValues["description"] = "Android SDK Demo"
        //establishDataValues["currency"] = "USD"
        establishDataValues["merchantReference"] = "1681478473504|iHdarq_gEPWM-Ly62TOybhjPuxkukIhNpby6ESv90DMIhcRWmkVkDz2APZ_Ei-rr"
        establishDataValues["paymentType"] = "Deferred"
        establishDataValues["customer.customerId"] = "19020"
        establishDataValues["customer.externalId"] = "19020"
        establishDataValues["customer.name"] = "trustly seven"
        establishDataValues["customer.taxId"] = "crypt:wMMfYM0jIzXNcWyeQxvVY9jzpk77WR3xDY9sz2hxakE="
        establishDataValues["customer.address.address1"] = "1400 Hudson Street "
        establishDataValues["customer.address.city"] = "Hoboken"
        establishDataValues["customer.address.state"] = "NJ"
        establishDataValues["customer.address.zip"] = "07030"
        establishDataValues["customer.address.country"] = "US"
        establishDataValues["customer.phone"] = "+17765756765"
        establishDataValues["customer.email"] = "trustly007@yopmail.com"
        establishDataValues["customer.dateOfBirth"] = "1981-01-01"
        establishDataValues["cancelUrl"] = "#cancel"
        establishDataValues["returnUrl"] = "#return"
        establishDataValues["requestSignature"] = "OnkybLgMnwG7I3CnhOYNQiI1dmU="
        //
        establishDataValues["metadata.urlScheme"] = "sdkdemo://"
        establishDataValues["env"] = "sandbox"
        return establishDataValues
    }

}