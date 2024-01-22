# SOLID PRINCIPLES ASSIGNMENT

## SINGLE RESPONSIBILITY PRINCIPLE (SRP)
### Customer Class
The `Customer` class is responsible for encapsulating customer information, providing methods to retrieve the customer's name and email. It adheres to the SRP by focusing solely on the management of customer data.

### Issue Class
The `Issue` class represents an issue within the system, maintaining information about the issue description and its resolution status. It follows the SRP by concentrating on the management of issue data.

### IssueResolver Interface and Implementations
The `IssueResolver` interface defines a contract for resolving issues. The implementations, `BasicIssueResolver` and `AdvancedIssueResolver`, adhere to the SRP by encapsulating distinct strategies for resolving issues.

### PremiumCustomer Class
The `PremiumCustomer` class extends the `Customer` class, introducing additional methods or overrides specific to premium customers. This specialization is designed to follow the SRP, providing an extension point for premium-specific functionality.

### CustomerInformation and IssueInformation Interfaces
The `CustomerInformation` and `IssueInformation` interfaces segregate methods related to customer and issue information, respectively, adhering to the Interface Segregation Principle (ISP).

### CustomerService Class
The `CustomerService` class implements both the `CustomerInformation` and `IssueInformation` interfaces. While it appears to handle multiple responsibilities, it is contextually justified, serving as a convenient data holder for customer and issue information in specific scenarios.

### IssueService Class
The `IssueService` class follows the SRP by having a single responsibility: resolving issues using the provided `IssueResolver`. It adheres to the Dependency Inversion Principle (DIP) by depending on abstractions, allowing for flexible issue resolution strategies.

## OPEN-CLOSED PRINCIPLE (OCP)
### IssueResolver Interface and Implementations
The `IssueResolver` interface is designed to be open for extension, allowing the system to introduce new issue resolution strategies without modifying existing code. Both `BasicIssueResolver` and `AdvancedIssueResolver` demonstrate this extensibility.

## LISKOV SUBSTITUTION PRINCIPLE (LSP)
### PremiumCustomer Class
The `PremiumCustomer` class extends the `Customer` class, honoring the Liskov Substitution Principle by behaving as a subtype of its parent class. This ensures that instances of `PremiumCustomer` can be used wherever instances of `Customer` are expected.

## INTERFACE SEGREGATION PRINCIPLE (ISP)
### CustomerInformation and IssueInformation Interfaces
The ISP is applied by creating specific interfaces (`CustomerInformation` and `IssueInformation`) tailored to their respective responsibilities, preventing clients from being forced to depend on interfaces they do not use.

## DEPENDENCY INVERSION PRINCIPLE (DIP)
### IssueService Class
The `IssueService` class adheres to the Dependency Inversion Principle by depending on abstractions (e.g., `IssueResolver` interface) rather than concrete implementations. This promotes flexibility and ease of extension.

## USAGE EXAMPLES
The `Main` class demonstrates the usage of the implemented classes and principles. It showcases the creation of customers, issues, resolution using different strategies, and the introduction of a premium customer with additional functionality.

