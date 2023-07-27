package com.example.kotlinbasics.rxjava

import io.reactivex.rxjava3.core.Observable

fun main() {
    /*
    * Subscribers (Observers):
    * Subscribers (or Observers) are entities that listen and respond to the data emitted by Observables.
    * They subscribe to an Observable to receive and handle data emitted by the Observable.
    * Subscribers implement the onNext, onError, and onComplete methods to handle data items, error events, and completion events emitted by the Observable, respectively.
    * */

    val numbersObservable = Observable.just(1, 2, 3)

    // Subscribing to the Observable with a Subscriber (Observer)
    numbersObservable.subscribe(
        { number -> println("Received: $number") }, // onNext: handling emitted data
        { error -> println("Error: ${error.message}") }, // onError: handling error event
        { println("Completed") } // onComplete: handling completion event
    )
}