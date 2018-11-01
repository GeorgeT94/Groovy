//this code won't compile, just an example

//java way
if(company.getContact() != null
    && company.getContact().getAddress() != null
    && company.getContact.getAddress().getCountry() == Country.NEW_ZEALAND) { ... }

//groovy way "?."" operator
    if(company.getContact()?.getAddress()?.getCountry() == Country.NEW_ZEALAND) { ... }