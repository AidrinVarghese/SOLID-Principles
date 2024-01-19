package com.ilp.services;

import com.ilp.entity.Issue;
import com.ilp.interfaces.IssueResolver;

public class BasicIssueResolver implements IssueResolver {
    @Override
    public void resolveIssue(Issue issue) {
        issue.resolveIssue(true);
        System.out.println("A ticket has been raised against your issue");
        System.out.println("Basic issue resolution applied for: " + issue.getDescription());

       
        try {
            Thread.sleep(10000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your ticket is resolved. Thank you!");
    }
}