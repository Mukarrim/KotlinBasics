package com.example.kotlinbasics.rxjava

import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.disposables.CompositeDisposable
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
    /*
    * Observables:
    * Observables represent a stream of data or events that can be observed over time.
    * They emit data items or events to their Subscribers (Observers) asynchronously.
    * An Observable can emit zero or more items, and it can terminate with either a completion signal (onComplete) or an error signal (onError).
    * Observables can be created from various data sources, such as collections, arrays, network calls, or other asynchronous processes.
    * */

    // Creating an Observable from a list of items
    val numbers = listOf(1, 2, 3, 4, 5)
    val observable = Observable.fromIterable(numbers)

    // Subscribing to the Observable
    observable.subscribe { number ->
        println("Received: $number")
    }

    // Operator
    // Using the map operator to transform each item in the list
    val observableOperator = Observable.fromIterable(numbers)
    observableOperator.map { number -> "Number: $number" }
        .subscribe { transformedNumber ->
            println(transformedNumber)
        }


    // Combining Observables
    val observable1 = Observable.just("Hello")
    val observable2 = Observable.just("World")

    // Merging two Observables
    Observable.merge(observable1, observable2)
        .subscribe { value ->
            println(value) // Output: "Hello", "World"
        }


    // Error Handling and Retry Logic
    val observableError = Observable.create<Int> { emitter ->
        // Simulating an error
        emitter.onError(Throwable("Oops, something went wrong!"))
    }

    observableError.retry(3)
        .subscribe(
            { value -> println("Received: $value") },
            { error -> println("Error: ${error.message}") }
        )


    // Threading and Schedulers
    val observableThreading = Observable.create<Int> { emitter ->
        // Long-running operation (e.g., network request)
        // Emitting the result on the IO thread
        emitter.onNext(fetchDataFromServer())
        emitter.onComplete()
    }

//    observableThreading.subscribeOn(Schedulers.io())
//        .observeOn(AndroidSchedulers.mainThread())
//        .subscribe { data ->
//            // Update UI with fetched data
//        }


    // Handling Disposable Resources
    // Using CompositeDisposable to manage disposables
    val compositeDisposable = CompositeDisposable()

    val disposable = observable.subscribe(
        { value -> println("Received: $value") },
        { error -> println("Error: ${error.message}") }
    )
    compositeDisposable.add(disposable)

    // Dispose the compositeDisposable when it's no longer needed
    compositeDisposable.clear()


}

fun fetchDataFromServer(): Int? {
    runBlocking {
        delay(1000L)
    }
    return 0
}
