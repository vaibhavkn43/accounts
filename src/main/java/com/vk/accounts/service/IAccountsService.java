package com.vk.accounts.service;

import com.vk.accounts.dto.CustomerDTO;

public interface IAccountsService {

    /**
     * @param customerDTO
     */

    void createAccount(CustomerDTO customerDTO);

    /**
     *
     * @param mobileNumber
     * @return
     */

    CustomerDTO fetchAccountDetails(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDTO customerDto);

    /**
     *
     * @param mobileNumber
     * @return
     */

    boolean deleteAccount(String mobileNumber);
}
