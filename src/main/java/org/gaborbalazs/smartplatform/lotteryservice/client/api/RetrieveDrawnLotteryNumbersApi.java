package org.gaborbalazs.smartplatform.lotteryservice.client.api;

import org.gaborbalazs.smartplatform.lotteryservice.client.domain.Draw;
import org.gaborbalazs.smartplatform.lotteryservice.client.enums.LotteryType;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * API for Retrieving Drawn Lottery Numbers.
 * For HTTP binder frameworks like Feign it is necessary to specify (redundantly) the name field for {@link PathVariable} in order to be properly bound.
 */
@RequestMapping("/retrieve")
public interface RetrieveDrawnLotteryNumbersApi {

    /**
     * Retrieving method for drawn lottery numbers based on lottery type.
     *
     * @param lotteryType is the type of the lottery
     * @return the drawn numbers
     */
    @RequestMapping(value = "/{lotteryType}/drawnNumbers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<? extends Draw> retrieve(@PathVariable("lotteryType") LotteryType lotteryType);
}
