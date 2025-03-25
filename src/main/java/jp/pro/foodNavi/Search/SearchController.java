package jp.pro.foodNavi.Search;

import jp.pro.foodNavi.Home.Shop;
import jp.pro.foodNavi.Home.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SearchController {
    private final ShopRepository repository;

    @GetMapping("/search")
    public String showSearchForm(@ModelAttribute Shop shop, Model model) {
        model.addAttribute("shopInformations",repository.findAll());
        return "search"; // search.html を表示
    }

    @GetMapping("/results")
    public String showSearchResult(ShopSearchItem item, Model model){

        Specification<Shop> spec = Specification.
                where(ShopSpecifications.hasName(item.getName()).
                        and(ShopSpecifications.hasAddress(item.getAddress()).
                                and(ShopSpecifications.hasCategory(item.getCategory()))));
        List<Shop> results = repository.findAll(spec);
        model.addAttribute("shopSearchResults",results);

        return "searchResult";
    }
}
