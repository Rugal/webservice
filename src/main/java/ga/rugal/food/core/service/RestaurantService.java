package ga.rugal.food.core.service;

import ga.rugal.food.core.entity.Menu;
import ga.rugal.food.core.entity.Restaurant;
import java.util.List;
import ml.rugal.sshcommon.page.Pagination;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ying Mi
 */
public interface RestaurantService
{

    Restaurant save(Restaurant bean);

    Restaurant deleteById(Integer id);

    @Transactional(readOnly = true)
    List<Restaurant> getWholeList();

    @Transactional(readOnly = true)
    Pagination getPage(int pageNo, int pageSize);

    @Transactional(readOnly = true)
    Menu getMenuByLocation();

    @Transactional(readOnly = true)
    int countTotal();
}
