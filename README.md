# ContaBancaria

A Java bank account model with deposit, withdrawal, a per-transaction withdrawal limit, and typed exception handling. The account enforces two rules on every withdrawal: the amount cannot exceed the per-transaction limit, and it cannot exceed the current balance.

## Structure

```
src/
  Application/Program.java   entry point, reads account data and performs a withdrawal
  Model/Account.java         account entity with deposit and withdrawal logic
  Model/Exception.java       custom exception extending RuntimeException
```

## Run

Compile from the `src` directory and run `Application.Program`:

```sh
javac -d out $(find src -name "*.java")
java -cp out Application.Program
```

## License

MIT.
