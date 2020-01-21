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
 * Api for Lottery Number Generator
 */
@RequestMapping("/lottery")
public interface LotteryNumberGeneratorApi {

    /**
     * It returns random lottery numbers by lottery type
     * @param lotteryType type of the lottery
     * @param generatorType type of the number generator type
     * @return ordered drawn lottery numbers generated randomly
     */
    @RequestMapping(value = "/{lotteryType}/numbers/random", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    SortedSet<Integer> generate(@PathVariable("lotteryType") LotteryType lotteryType, @RequestParam(name = "generatorType", defaultValue = "default") GeneratorType generatorType);
}