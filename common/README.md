# Common Module

Shared domain models, interfaces, and utilities.

## Package rules

### `core` includes pure, zero-dependency domain primitives

Keep free of Spring, persistence, and other framework
types so any service can use them.

### Client packages do not depend on one another

Each `client.<service>` package describes contracts produced by that service.
For example, customer client types must not import from `client.kyc` or
`client.onboarding-orchestrator`. A client package may use types from `core`.

If a concept is genuinely shared by multiple services, consider whether it
belongs in `core`; do not create a cross-service client-package dependency.