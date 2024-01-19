package com.ilp.services;

import com.ilp.entity.Issue;
import com.ilp.interfaces.IssueResolver;

public class AdvancedIssueResolver implements IssueResolver {
    @Override
    public void resolveIssue(Issue issue) {
        issue.resolveIssue(true);
        System.out.println("A ticket has been raised against your issue");
        System.out.println("Advanced issue resolution applied for: " + issue.getDescription());
        
        
        try {
            Thread.sleep(2000); // 5000 milliseconds (5 seconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Your ticket is resolved. Thank you!");
    }
}