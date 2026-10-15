# Exercises for the chapter "Testing"

## a) FactorialCalculator

File: `src/main/kotlin/exrc/chpt_080/a_assertions.kt`

Write two test cases for the existing class `FactorialCalculator`.

* is an exception with the correct message thrown for wrong input?
* is the result correct for a series of given inputs and expected outputs?

You can let IntelliJ generate the test cases (Code > Generate). Since we don't have a separate test source folder,
the test source code may go into the same directory (as an exception ...)

## c) OrderService

Files:

- `src/main/kotlin/exrc/chpt_080/c_orderService.kt`
- `src/main/kotlin/exrc/chpt_080/OrderServiceTest.kt`

There is an `OrderService` that queries a third-party service for product details via a `ProductApiClient`.

We want to mock the API client to test the business logic of the service:

* on the first call to `isAvailable()` the client returns `false`, after that `true` (hint: `returnsMany()`)
* the two existing products are to be returned for each request

The following things have to be done:

1. program the mock
2. implement the business logic of `OrderService.calculateOrderTotal` (as an exercise for list operations)
3. verify the mock for correct calls (for both functions of the API client)
