# Exercises for the chapter "Testing"

## a) FactorialCalculator

File: `src/main/kotlin/exrc/chpt_080/a_assertions.kt`

Write two test cases for the existing class `FactorialCalculator`.

* is an exception generated with the correct message for the wrong input?
* is the result correct for a series of given inputs and expected outputs?

You can generate tests via Intellij (Code > Generate). Since we do not have a separate test source folder
the test source code may end up in the same directory (exceptionally…)

## c) OrderService

File: `src/main/kotlin/exrc/chpt_080/c_orderService.kt`

There is an `OrderService` that queries a third-party service for product details via a `ProductApiClient`.

We want to mock the API client in order to test the business logic of the service:

* on the first call to `isAvailable()` the client returns a `false`, from then on always a `true` (
  Hint: `returnsMany()`)
* the two existing products should be returned for each request

The following things have to be done:

1. program the mock
2. implement the business logic of `OrderService.calculateOrderTotal` (as an exercise for list operations)
3. check the mock for correct calls (for both functions of the API client)

