# [Coroutines](https://kotlinlang.org/docs/coroutines-guide.html)

- To perform multiple operations at once (concurrency) Kotlin uses
coroutines.
- Coroutine is short for "co" and "[sub]routine".
- But first let's learn about what solutions exist and how coroutines fits in.

_Watch: [Dave Leeds Kotlin Coroutines Playlist](https://www.youtube.com/playlist?list=PLWrj8esSzGuUPygsje2i5cQ8WslI7FbdZ)_

## Async Programming

Prevent applications from blocking. There are a lot of ways to go about this:
- Threading
- Callbacks
- ...
- Coroutines

Kotlin takes the coroutines approach. The main idea behind coroutines
is functions that can suspend and resume at a later point.

Usually when we think of functions, they take input, do something,
and maybe return a result. With coroutines, functions can yield 
a result back to their caller (like `return`), pause their execution, 
and preserve their state. We do this via `suspend fun`s.

Coroutines have been around in other languages (see [Goroutines](https://go.dev/tour/concurrency/1)).

But Kotlin implements them in a slightly different way, delegating a 
lot of the functionality to libraries.

---
