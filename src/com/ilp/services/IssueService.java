package com.ilp.services;
import com.ilp.entity.Issue;

import com.ilp.interfaces.IssueResolver;
//High-level Module (IssueService) Depends on Abstraction (IssueResolver)
public class IssueService {
    private IssueResolver resolver;

    public IssueService(IssueResolver resolver) {
        this.resolver = resolver;
    }

 // Method in the High-level Module that Delegates to the Abstraction
    public void resolveIssue(Issue issue) {
        resolver.resolveIssue(issue);
    }
}