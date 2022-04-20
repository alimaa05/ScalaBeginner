var amount = -100

amount match {
  case 50 => println("$50") // used arrow to separate pattern with the execution when pattern matches
  case 100 => println("$100")
  // _ = wildcard (means match everything)
  case _ => println("Not a $50 or $100 bill") // default handler if there are no matches
}


