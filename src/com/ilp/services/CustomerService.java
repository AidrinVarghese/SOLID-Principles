package com.ilp.services;

import com.ilp.entity.Customer;
import com.ilp.entity.Issue;
import com.ilp.interfaces.CustomerInformation;
import com.ilp.interfaces.IssueInformation;

public class CustomerService implements CustomerInformation, IssueInformation {
    private Customer customer;
    private Issue issue;

    public CustomerService(Customer customer, Issue issue) {
        this.customer = customer;
        this.issue = issue;
    }

    @Override
    public String getCustomerName() {
        return customer.getName();
    }

    @Override
    public String getIssueDescription() {
        return issue.getDescription();
    }
}