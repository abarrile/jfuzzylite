/*   Copyright 2013 Juan Rada-Vilela

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.fuzzylite.defuzzifier;

import com.fuzzylite.term.Accumulated;
import com.fuzzylite.term.Term;
import com.fuzzylite.term.Thresholded;

/**
 *
 * @author jcrada
 */
public class WeightedSum extends Defuzzifier {

    @Override
    public double defuzzify(Term term, double minimum, double maximum) {
        Accumulated takagiSugeno = (Accumulated) term;
        double sum = 0.0;
        for (Term t : takagiSugeno.getTerms()) {
            Thresholded thresholded = (Thresholded) t;
            /**
             * z is tsukamoto, and when it is takagi, it will not matter as it
             * will be a function previously, takagi-sugeno was: sum +=
             * thresholded->getThreshold() *
             * thresholded->getTerm()->membership(0); so replacing 0 with
             * threshold w will give the same for takagi-sugeno, plus provide
             * tsukamoto*
             */
            double w = thresholded.getThreshold();
            double z = Tsukamoto.tsukamoto(thresholded,
                    takagiSugeno.getMinimum(), takagiSugeno.getMaximum());
            sum += w * z;
        }
        return sum;
    }

}
