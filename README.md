# Automi e linguaggi formali - SWL Parser

Progetto finale del corso di Automi e Linguaggi Formali 2018 - UNIPD.
Realizzato da:
- Brian Federico - [bubogunz](https://github.com/bubogunz)
- Schiabel Alberto - [jkomyon](https://github.com/jkomyno)

## Features

Per poter permette una maggior leggibilità e la possibilità di dichiarare un `channel` dedicato ai commenti, la grammatica è stata suddivisa
rispettivamente in [swlLexer.g4](swl/swlLexer.g4) e [swlParser.g4](swl/swlParser.g4).

#### Requisiti minimi:

- [x] condizioni if / else if / else
- [x] while loop
- [x] espressioni booleane complesse
- [x] supporto operatori logici and / or / not

#### Funzionalità aggiuntive:

- [x] for loop
- [x] metodo di print variadico
- [x] metodo di input
- [x] commenti inline o di blocco
- [x] supporto stringhe letterali (non assegnate a variabili/costanti)

## Esempi

- [Calcolo n-esimo valore della serie di Fibonacci](swl/examples/fibonacci.swl)

## Utilizzo

#### Setup & Build

- `git clone htts://github/jkomyno/automata-project /home/antlr4`
- `source setup.sh`
- `cd swl`
- `make grammar`
- `make all`

#### Controllo errori

- `./syncheck NOMEFILE.swl`

#### Traduzione errori

- `./translate NOMEFILE.swl`

#### Build esempi

- `make examples`
