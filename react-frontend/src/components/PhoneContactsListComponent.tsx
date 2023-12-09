import './style.css';
import {PhoneContact} from '../models/PhoneContactModel';
import PhoneContactService from '../services/PhoneContactService';
import {useEffect, useState} from 'react';

const PhoneContactsListComponent = () => {
    const [phoneContacts, setPhoneContacts] = useState<PhoneContact[]>([])

    useEffect(() => {
        PhoneContactService.getPhoneContacts()
            .then((response) => {
                setPhoneContacts(response.data)
            })
            .catch(() => {
                console.warn("Error fetching PhoneContacts")
                console.log("Setting PhoneContacts stub")
                setPhoneContacts(PhoneContactService.getPhoneContactsStub)
            })
    }, []);

    return (
        <div>
            <h2 className="ContactListTextHeader">Phone contacts</h2>
            <div className="row">
                <button className="btn btn-primary"> Add contact</button>
            </div>
            <br></br>
            <div className="row">
                <table className="table table-striped table-bordered">

                    <thead>
                    <tr>
                        <th> First Name</th>
                        <th> Last Name</th>
                        <th> Phone number</th>
                        <th> Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        phoneContacts.map((
                            employee, i) =>
                            <tr key={i}>
                                <td> {employee.firstName} </td>
                                <td> {employee.lastName}</td>
                                <td> {employee.phoneNumber}</td>
                                <td>
                                    <button
                                        className="btn btn-info">Update
                                    </button>
                                    <button style={{marginLeft: "10px"}}
                                            className="btn btn-danger">Delete
                                    </button>
                                    <button style={{marginLeft: "10px"}}
                                            className="btn btn-info">View
                                    </button>
                                </td>
                            </tr>
                        )
                    }
                    </tbody>
                </table>

            </div>

        </div>
    )
};

export default PhoneContactsListComponent;