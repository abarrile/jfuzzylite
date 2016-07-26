/*
 Copyright (C) 2010-2016 by FuzzyLite Limited.
 All rights reserved.

 This file is part of jfuzzylite(TM).

 jfuzzylite is free software: you can redistribute it and/or modify it under
 the terms of the FuzzyLite License included with the software.

 You should have received a copy of the FuzzyLite License along with
 jfuzzylite. If not, see <http://www.fuzzylite.com/license/>.

 fuzzylite(R) is a registered trademark of FuzzyLite Limited.
 jfuzzylite(TM) is a trademark of FuzzyLite Limited.

 */
package com.fuzzylite.factory;

import com.fuzzylite.term.Bell;
import com.fuzzylite.term.Binary;
import com.fuzzylite.term.Concave;
import com.fuzzylite.term.Constant;
import com.fuzzylite.term.Cosine;
import com.fuzzylite.term.Discrete;
import com.fuzzylite.term.Function;
import com.fuzzylite.term.Gaussian;
import com.fuzzylite.term.GaussianProduct;
import com.fuzzylite.term.Linear;
import com.fuzzylite.term.PiShape;
import com.fuzzylite.term.Ramp;
import com.fuzzylite.term.Rectangle;
import com.fuzzylite.term.SShape;
import com.fuzzylite.term.Sigmoid;
import com.fuzzylite.term.SigmoidDifference;
import com.fuzzylite.term.SigmoidProduct;
import com.fuzzylite.term.Spike;
import com.fuzzylite.term.Term;
import com.fuzzylite.term.Trapezoid;
import com.fuzzylite.term.Triangle;
import com.fuzzylite.term.ZShape;

public class TermFactory extends ConstructionFactory<Term> {

    public TermFactory() {
        register("", null);
        register(Bell.class);
        register(Binary.class);
        register(Concave.class);
        register(Constant.class);
        register(Cosine.class);
        register(Discrete.class);
        register(Function.class);
        register(Gaussian.class);
        register(GaussianProduct.class);
        register(Linear.class);
        register(PiShape.class);
        register(Ramp.class);
        register(Rectangle.class);
        register(SShape.class);
        register(Sigmoid.class);
        register(SigmoidDifference.class);
        register(SigmoidProduct.class);
        register(Spike.class);
        register(Trapezoid.class);
        register(Triangle.class);
        register(ZShape.class);
    }

    @Override
    public TermFactory clone() throws CloneNotSupportedException {
        return (TermFactory) super.clone();
    }

}
