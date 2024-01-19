package com.ilp.main;

import java.util.Scanner;
import com.ilp.entity.Customer;
import com.ilp.entity.Issue;
import com.ilp.interfaces.IssueResolver;
import com.ilp.services.BasicIssueResolver;
import com.ilp.services.AdvancedIssueResolver;
import com.ilp.services.CustomerService;
import com.ilp.services.IssueService;

public class Main {
    public static void main(String[] args) {
        char choice;
        Scanner scanner = new Scanner(System.in);

        
        	System.out.println("\t \t EPIC GAMES STORE SUPPORT CENTER\n");
            System.out.print("User Name : ");
            String customerName = scanner.nextLine();
            System.out.print("E-mail : ");
            String customerEmail = scanner.nextLine();
            System.out.print("Describe the issue you're facing : ");
            String issueTicket = scanner.nextLine();

            Customer customer = new Customer(customerName, customerEmail);
            Issue issue = new Issue(issueTicket);
            do {
            // Select customer type (Basic or Premium)
            System.out.println("\n \nSelect customer type:");
            System.out.println("1. Basic Customer");
            System.out.println("2. Premium Customer\n");
            int customerTypeChoice = scanner.nextInt();

            CustomerService customerService = new CustomerService(customer, issue);
            IssueResolver resolver;

            switch (customerTypeChoice) {
                case 1:
                    // Basic Customer
                    System.out.println("\nBasic Customer Name: " + customerService.getCustomerName());
                    System.out.println("Basic Issue: " + customerService.getIssueDescription());
                    resolver = new BasicIssueResolver();
                    break;
                case 2:
                    // Premium Customer
                    System.out.println("\nPremium Customer Name: " + customerService.getCustomerName());
                    System.out.println("Premium Issue: " + customerService.getIssueDescription());

                    // Offer resolver options for Premium Customer
                    System.out.println("\nSelect issue resolver for Premium Customer:");
                    System.out.println("\n1. Basic Resolver");
                    System.out.println("2. Advanced Resolver\n");
                    int resolverChoice = scanner.nextInt();

                    if (resolverChoice == 1) {
                        resolver = new BasicIssueResolver();
                    } else if (resolverChoice == 2) {
                        resolver = new AdvancedIssueResolver();
                    } else {
                        System.out.println("Invalid resolver choice.");
                        return;
                    }
                    break;

                default:
                    System.out.println("Invalid customer type choice.");
                    return;
            }

            IssueService issueService = new IssueService(resolver);
            issueService.resolveIssue(issue);

            System.out.println("\nAny more issues? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        // Close the scanner
        scanner.close();
    }
}