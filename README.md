StockMarketSim

A Java-based stock market simulation project built incrementally to practice object-oriented programming, simulation logic, and Java fundamentals.

V1 — Basic Stock & Investor System

V1 established the core objects and trading behavior.

Features

* Create a stock with:
    * Company name
    * Ticker symbol
    * Current price
* Create an investor with:
    * Name
    * Cash balance
    * Shares owned
* Buy shares
* Sell shares
* Calculate portfolio value
* Update stock price manually
* Validate stock prices and transaction amounts

Classes

* Stock — Represents a stock and manages its price.
* Investor — Represents an investor and manages buying, selling, and portfolio value.
* Main — Tests the functionality of the project.

V2 — Market Simulation

V2 introduces dynamic market behavior and a simple trading simulation.

Features

* Random daily stock-price movement
* Daily price changes between approximately -5% and +5%
* 10-day market simulation
* Investor starts with $1,000
* Investor purchases 5 shares
* Portfolio value updates dynamically as the stock price changes
* Formatted financial output to two decimal places

V2 Concepts Practiced

* Math.random()
* Random value ranges
* Percentage calculations
* for loops
* Object interaction
* Method reuse
* Formatted output with printf
* Simulation logic

Example Simulation

Initial price: $100.00
Shares owned: 5
Portfolio value: $1000.00
Day 1
Updated price: $102.66
Portfolio value: $1013.31
Day 2
Updated price: $97.94
Portfolio value: $989.71
...
Day 10
Updated price: $111.61
Portfolio value: $1058.05

Future Versions

V3 — Multiple Investors

* Multiple investors
* Different starting balances
* Investors making independent trades


Skills Practiced

* Java
* Object-oriented programming
* Encapsulation
* Classes and objects
* Methods
* Loops
* Random number generation
* Basic simulation design
* Git and GitHub
* 
