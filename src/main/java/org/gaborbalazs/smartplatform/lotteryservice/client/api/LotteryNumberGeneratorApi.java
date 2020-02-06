package org.gaborbalazs.smartplatform.lotteryservice.client.api;

import java.util.SortedSet;

import org.gaborbalazs.smartplatform.lotteryservice.client.enums.GeneratorType;
import org.gaborbalazs.smartplatform.lotteryservice.client.enums.LotteryType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * API for Lottery Number Generator.
 * For HTTP binder frameworks like Feign it is necessary to specify (redundantly) the name field for {@link RequestParam} in order to be properly bound.
 */
@RequestMapping("/lottery")
public interface LotteryNumberGeneratorApi {

    /**
     * Lottery number generator method based on lottery type.
     *
     * @param lotteryType   is the type of the lottery
     * @param generatorType is the type of the number generator
     * @return the drawn numbers
     */
    @RequestMapping(value = "/{lotteryType}/numbers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    SortedSet<Integer> generate(@PathVariable("lotteryType") LotteryType lotteryType, @RequestParam(name = "generatorType", defaultValue = "default") GeneratorType generatorType);

    /**
     * Lottery number generator method based on quantity and pool size.
     *
     * @param quantity      is the number of drawn numbers
     * @param poolSize      is the pool of numbers
     * @param generatorType is the type of the number generator
     * @return the drawn numbers
     */
    @RequestMapping(value = "/numbers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    SortedSet<Integer> generate(@RequestParam(name = "quantity") int quantity, @RequestParam(name = "poolSize") int poolSize, @RequestParam(name = "generatorType", defaultValue = "default") GeneratorType generatorType);
}