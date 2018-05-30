# Automi e linguaggi formali - SWL Parser

Progetto finale del corso di Automi e Linguaggi Formali 2018 - UNIPD.
Realizzato da:
- Brian Federico - [bubogunz](https://github.com/bubogunz)
- Schiabel Alberto - [jkomyno](https://github.com/jkomyno)

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
- [Stampa albero di Natale a n livelli](swl/examples/christmasTree.swl)
- [Stampa di un utilizzo generico della sintassi offerta da SWL](swl/examples/example.swl)

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

I seguenti comandi stampano il codice swl tradotto in C++ e compilano il target in file eseguibile.
Gli eseguibili saranno creati nella cartella [swl/examples/](swl/examples/).

- `make fibonacci`
- `make tree`
- `make example`

Oppure, per compilarli tutti:
- `make examples`

## Limitazioni note

- non sono presenti istruzioni "inline" (non è possibile calcolare ad esempio i=a+b senza step intermedi)
- i commenti nel codice swl vengono solamente nascosti, e non riportati nel codice C++
