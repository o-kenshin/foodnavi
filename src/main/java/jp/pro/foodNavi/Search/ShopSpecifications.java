package jp.pro.foodNavi.Search;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jp.pro.foodNavi.Home.Shop;
import org.springframework.data.jpa.domain.Specification;

public class ShopSpecifications {

    public static Specification<Shop> hasName(final String name){
        return new Specification<Shop>() {
            @Override
            public Predicate toPredicate(Root<Shop> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                if(name==null||name.isEmpty()){
                    return null;
                }

                return criteriaBuilder.like(root.get("name"), "%"+name+"%");
            }
        };
    }

    public static Specification<Shop> hasAddress(final String address){
        return new Specification<Shop>() {
            @Override
            public Predicate toPredicate(Root<Shop> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                if(address==null||address.isEmpty()){
                    return null;
                }

                return criteriaBuilder.like(root.get("address"), "%"+address+"%");
            }
        };
    }

    public static Specification<Shop> hasCategory(final String category){
        return new Specification<Shop>() {
            @Override
            public Predicate toPredicate(Root<Shop> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                if(category==null||category.isEmpty()){
                    return null;
                }

                return criteriaBuilder.like(root.get("category"), "%"+category+"%");
            }
        };
    }

}
