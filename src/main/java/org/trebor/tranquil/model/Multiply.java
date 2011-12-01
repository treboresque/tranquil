package org.trebor.tranquil.model;

public class Multiply extends AbstractOperator
{
  public Multiply()
  {
    super("*", Arity.TWO);
  }
  
  public Multiply(Term a, Term b)
  {
    this();
    addTerms(a, b);
  }
}
