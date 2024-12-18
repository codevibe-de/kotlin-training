# Exercises for the chapter "Testing"

## a) FactorialCalculator

File: `src/main/kotlin/exrc/chpt_080/a_assertions.kt`

Write two test cases for the existing class `FactorialCalculator`.

* does giving a wrong input generate an exception with the correct message?
* are expected results generated for a series of given inputs?

You can generate test code via Intellij (Code > Generate).
Since we do not have a separate test source folder, it's okay that the test source code ends up in the same directory.

## c) OrderService

File: `src/main/kotlin/exrc/chpt_080/c_orderService.kt`

The `OrderService` queries a third-party service for product details via a `ProductApiClient`.

We want to mock the API client to test the business logic of the service:

* upon the first call to `isAvailable()` the client returns a `false`, from then on always a `true` (
  Hint: `returnsMany()`)
* the two existing products should be returned for each request

The following things have to be done:

1. stub the mock, i.e., write code that defines the behavior of the mock
2. implement the business logic of `OrderService.calculateOrderTotal` (as an exercise for list operations)
3. check the mock for correct calls (for both functions of the API client)

