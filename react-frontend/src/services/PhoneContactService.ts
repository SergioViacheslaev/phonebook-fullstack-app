import axios from 'axios';
import {PhoneContact} from '../models/PhoneContactModel';

const PHONE_CONTACTS_API_BASE_URL = "http://localhost:8080/api/v1/phone-contacts";

class PhoneContactService {

    getPhoneContacts() {
        console.log('Get', PHONE_CONTACTS_API_BASE_URL)
        return axios.get(PHONE_CONTACTS_API_BASE_URL)
    }

    getPhoneContactsStub(): Array<PhoneContact> {
        return [
            {
                firstName: "Stub Foo",
                lastName: "Bar",
                phoneNumber: 12345
            },
            {
                firstName: "Stub Steve",
                lastName: "Jobs",
                phoneNumber: 54321
            },
        ]
    }

}

const phoneContactService = new PhoneContactService();
export default phoneContactService