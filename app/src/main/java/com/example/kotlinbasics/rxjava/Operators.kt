package com.example.kotlinbasics.rxjava

import io.reactivex.rxjava3.core.Observable

fun main() {

    /*
    * Operators:
    * Operators are powerful transformation functions that allow you to modify, filter, combine, or control the flow of data emitted by Observables.
    * They enable you to perform various operations on the emitted data, such as filtering, mapping, combining, or performing calculations.
    * Operators help in composing complex data processing pipelines in a clean and declarative manner.
    * */
    // Creating an Observable from a list of items
    val numbers = listOf(1, 2, 3, 4, 5)
    val observable = Observable.fromIterable(numbers)
    // Using the map operator to transform each emitted number to its square
    observable.map { number -> number * number }
        .subscribe { squaredNumber ->
            println("Squared: $squaredNumber")
        }



    /*
    * Types of Operators
    *
    *
    * Transformation Operators:
    * map: Transforms each item emitted by an Observable into another item.
    * flatMap: Transforms each item emitted by an Observable into another Observable and flattens the emissions into a single stream.
    * concatMap: Similar to flatMap, but maintains the order of emissions from the source Observable.
    * switchMap: Cancels previous emissions and switches to a new Observable when a new item is emitted by the source Observable.
    * scan: Applies a function to each item emitted by an Observable sequentially and emits the accumulated results.
    *
    *
    * Filtering Operators:
    * filter: Emits only those items from the Observable that satisfy a given condition.
    * distinct: Emits distinct items (removing duplicates) emitted by the Observable.
    * debounce: Delays emissions from the Observable and emits the last item after a specified time span, effectively filtering out frequent emissions.
    * take: Emits only the first n items emitted by the Observable.
    * skip: Skips the first n items emitted by the Observable and emits the rest.
    *
    *
    * Combination Operators:
    * merge: Merges multiple Observables into a single Observable, emitting items from all of them in the order they are emitted.
    * concat: Concatenates multiple Observables into a single Observable, emitting items in sequential order.
    * combineLatest: Combines the latest emissions of multiple Observables and emits the combined result whenever any of the Observables emit a new item.
    * zip: Combines the emissions of multiple Observables based on their order and emits the result as a single item.
    *
    *
    * Error Handling Operators:
    * onErrorReturn: Replaces an error emitted by the Observable with a default value and continues the sequence.
    * onErrorResumeNext: Resumes the sequence with another Observable in case of an error in the source Observable.
    * retry: Re-subscribes to the Observable in case of an error, allowing for a specified number of retries.
    *
    *
    * Utility Operators:
    * doOnNext: Performs an action for each item emitted by the Observable but does not modify the emitted item.
    * doOnError: Performs an action when an error is emitted by the Observable.
    * doOnComplete: Performs an action when the Observable completes successfully.
    * doOnSubscribe and doOnDispose: Perform actions when a Subscriber subscribes to or disposes of the Observable.
    *
    *
    * Conditional and Boolean Operators:
    * all: Determines if all items emitted by the Observable meet a specified condition.
    * any: Determines if any item emitted by the Observable meets a specified condition.
    * takeWhile: Takes items from the Observable while they satisfy a given condition.
    * */
}