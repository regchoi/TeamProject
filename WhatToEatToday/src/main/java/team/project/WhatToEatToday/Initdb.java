//
//package team.project.WhatToEatToday;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import team.project.WhatToEatToday.domain.*;
//import team.project.WhatToEatToday.domain.member.Admin;
//import team.project.WhatToEatToday.domain.member.Customer;
//import team.project.WhatToEatToday.domain.member.Manager;
//import team.project.WhatToEatToday.repository.CategoryRepository;
//import team.project.WhatToEatToday.repository.EatingHouseRepository;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//
//@Component
//@RequiredArgsConstructor
//public class Initdb {
//
//    private final InitService initService;
//
//    @PostConstruct
//    public void init() {
//        initService.dbInit1();
//        initService.dbInit2();
//        initService.dbInit3();
//        initService.dbInit4();
//        initService.dbInit5();
//        initService.dbInit6();
//    }
//
//    @Component
//    @Transactional
//    @RequiredArgsConstructor
//    static class InitService {
//
//        private final EntityManager em;
//        private final CategoryRepository categoryRepository;
//
//        public void dbInit1() {
//            Admin admin = createAdmin("admin", "admin", "admin", "admin", "admin", null);
//            em.persist(admin);
//        }
//
//        public void dbInit2() {
//            Manager manager1 = createManager("manager1", "manager1", "manager1", "manager1", "manager1", null);
//            em.persist(manager1);
//            Manager manager2 = createManager("manager2", "manager2", "manager2", "manager2", "manager2", null);
//            em.persist(manager2);
//            Manager manager3 = createManager("manager3", "manager3", "manager3", "manager3", "manager3", null);
//            em.persist(manager3);
//        }
//
//        public void dbInit3() {
//            Customer customer = createCustomer("customer", "customer", "customer", "customer", "customer", null);
//            em.persist(customer);
//        }
//        public void dbInit4() {
//            Category category = createCategoryOne(1L, "????????????");
//            category.setParent(category);
//            em.persist(category);
//        }
//
//        public void dbInit5() {
//            Category category = categoryRepository.findById(1L).orElseThrow();
//            Category category1 = createCategory(2L, "??????", category);
//            em.persist(category1);
//            Category category2 = createCategory(3L, "??????", categoryRepository.findById(1L).orElseThrow());
//            em.persist(category2);
//            Category category3 = createCategory(4L, "??????", categoryRepository.findById(1L).orElseThrow());
//            em.persist(category3);
//            Category category4 = createCategory(5L, "??????", categoryRepository.findById(1L).orElseThrow());
//            em.persist(category4);
//            Category category5 = createCategory(6L, "??????", categoryRepository.findById(1L).orElseThrow());
//            em.persist(category5);
//            Category category6 = createCategory(7L, "??????", categoryRepository.findById(1L).orElseThrow());
//            em.persist(category6);
//            Category category7 = createCategory(8L, "?????????", categoryRepository.findById(1L).orElseThrow());
//            em.persist(category7);
//
//        }
//
//
//        public void dbInit6() {
//        	ConditionCategory concate1 = createConditionCategory(1L, "??????");
//        	em.persist(concate1);
//        	ConditionCategory concate2 = createConditionCategory(2L, "??????");
//        	em.persist(concate2);
//        	ConditionCategory concate3 = createConditionCategory(3L, "??????");
//        	em.persist(concate3);
//
//
//        	Condition condition1 = createCondition(1L, "?????????", concate1);
//        	em.persist(condition1);
//        	Condition condition2 = createCondition(2L, "????????????", concate1);
//        	em.persist(condition2);
//        	Condition condition3 = createCondition(3L, "?????? ?????????", concate1);
//        	em.persist(condition3);
//        	Condition condition4 = createCondition(4L, "?????????", concate1);
//        	em.persist(condition4);
//        	Condition condition5 = createCondition(5L, "?????????", concate1);
//        	em.persist(condition5);
//        	Condition condition6 = createCondition(6L, "?????????", concate1);
//        	em.persist(condition6);
//        	Condition condition7 = createCondition(7L, "????????????", concate1);
//        	em.persist(condition7);
//        	Condition condition8 = createCondition(8L, "????????????", concate1);
//        	em.persist(condition8);
//        	Condition condition9 = createCondition(9L, "?????????", concate1);
//        	em.persist(condition9);
//        	Condition condition10 = createCondition(10L, "??????", concate1);
//        	em.persist(condition10);
//        	Condition condition11 = createCondition(11L, "??????", concate1);
//        	em.persist(condition11);
//        	Condition condition12 = createCondition(12L, "?????????", concate1);
//        	em.persist(condition12);
//        	Condition condition13 = createCondition(13L, "?????????", concate1);
//        	em.persist(condition13);
//        	Condition condition14 = createCondition(14L, "?????????", concate1);
//        	em.persist(condition14);
//        	Condition condition15 = createCondition(15L, "???????????? ??????", concate1);
//        	em.persist(condition15);
//
//
//        	Condition condition16 = createCondition(16L, "?????????", concate2);
//        	em.persist(condition16);
//        	Condition condition17 = createCondition(17L, "?????????", concate2);
//        	em.persist(condition17);
//        	Condition condition18 = createCondition(18L, "??????", concate2);
//        	em.persist(condition18);
//        	Condition condition19 = createCondition(19L, "??????", concate2);
//        	em.persist(condition19);
//        	Condition condition20 = createCondition(20L, "????????????", concate2);
//        	em.persist(condition20);
//        	Condition condition21 = createCondition(21L, "?????????", concate2);
//        	em.persist(condition21);
//        	Condition condition22 = createCondition(22L, "????????????", concate2);
//        	em.persist(condition22);
//        	Condition condition23 = createCondition(23L, "???????????? ??????", concate2);
//        	em.persist(condition23);
//        	Condition condition24 = createCondition(24L, "?????????", concate2);
//        	em.persist(condition24);
//        	Condition condition25 = createCondition(25L, "????????????", concate2);
//        	em.persist(condition25);
//        	Condition condition26 = createCondition(26L, "?????? ???", concate2);
//        	em.persist(condition26);
//        	Condition condition27 = createCondition(27L, "?????????", concate2);
//        	em.persist(condition27);
//        	Condition condition28 = createCondition(28L, "?????????", concate2);
//        	em.persist(condition28);
//        	Condition condition29 = createCondition(29L, "??????", concate2);
//        	em.persist(condition29);
//        	Condition condition30 = createCondition(30L, "??????", concate2);
//        	em.persist(condition30);
//
//
//        	Condition condition31 = createCondition(31L, "???????????? 3?????? ???", concate3);
//        	em.persist(condition31);
//        	Condition condition32 = createCondition(32L, "?????????????????? ???", concate3);
//        	em.persist(condition32);
//        	Condition condition33 = createCondition(33L, "???????????? ???", concate3);
//        	em.persist(condition33);
//        	Condition condition34 = createCondition(34L, "????????? ???", concate3);
//        	em.persist(condition34);
//        	Condition condition35 = createCondition(35L, "?????? ???????????? ???", concate3);
//        	em.persist(condition35);
//        	Condition condition36 = createCondition(36L, "?????? ?????? ?????? ???", concate3);
//        	em.persist(condition36);
//        	Condition condition37 = createCondition(37L, "?????? ????????? ???", concate3);
//        	em.persist(condition37);
//        	Condition condition38 = createCondition(38L, "?????? ??? ?????? ???", concate3);
//        	em.persist(condition38);
//        	Condition condition39 = createCondition(39L, "????????? ?????? ???", concate3);
//        	em.persist(condition39);
//        	Condition condition40 = createCondition(40L, "????????? ????????? ?????? ???", concate3);
//        	em.persist(condition40);
//        	Condition condition41 = createCondition(41L, "??? ????????? ???", concate3);
//        	em.persist(condition41);
//        	Condition condition42 = createCondition(42L, "???????????? ??? ????????? ???", concate3);
//        	em.persist(condition42);
//        	Condition condition43 = createCondition(43L, "???????????? ???", concate3);
//        	em.persist(condition43);
//        	Condition condition44 = createCondition(44L, "?????? ???", concate3);
//        	em.persist(condition44);
//        	Condition condition45 = createCondition(45L, "?????????", concate3);
//        	em.persist(condition45);
//
////        	ConditionMenu[] cond = new ConditionMenu[145];
////        	for(int i = 0; i < 145; i++) {
////        		cond[i] = createConditionMenu("?????????"+i, condition1);
////            	em.persist(cond[i]);
////        	}
//
//            CrossMenu crossMenu = createCrossMenu("??????");
//            em.persist(crossMenu);
//
//
//
//
//        }
//
//
//
//
//
//        private Admin createAdmin(String id, String password, String name, String email, String tel, String address) {
//            Admin admin = new Admin();
//            admin.setLoginId(id);
//            admin.setPassword(password);
//            admin.setName(name);
//            admin.setEmail(email);
//            admin.setTel(tel);
//            admin.setAddress(address);
//            return admin;
//        }
//
//        private Manager createManager(String id, String password, String name, String email, String tel, String address) {
//            Manager manager = new Manager();
//            manager.setLoginId(id);
//            manager.setPassword(password);
//            manager.setName(name);
//            manager.setEmail(email);
//            manager.setTel(tel);
//            manager.setAddress(address);
//            return manager;
//        }
//
//        private Customer createCustomer(String id, String password, String name, String email, String tel, String address) {
//            Customer customer = new Customer();
//            customer.setLoginId(id);
//            customer.setPassword(password);
//            customer.setName(name);
//            customer.setEmail(email);
//            customer.setTel(tel);
//            customer.setAddress(address);
//            return customer;
//        }
//        private Category createCategoryOne(Long id, String name) {
//            Category category = new Category();
//            category.setId(id);
//            category.setName(name);
//            return category;
//        }
//        private Category createCategory(Long id, String name, Category ids) {
//            Category cate = ids;
//            Category category = new Category();
//            category.setId(id);
//            category.setName(name);
//            category.setParent(cate);
//            return category;
//        }
//
//        private ConditionCategory createConditionCategory(Long id, String name) {
//        	ConditionCategory concate = new ConditionCategory();
//        	concate.setId(id);
//        	concate.setName(name);
//        	return concate;
//        }
//
//        private Condition createCondition(Long id, String name, ConditionCategory concate) {
//        	Condition condition = new Condition();
//        	condition.setId(id);
//        	condition.setName(name);
//        	condition.setConditionCategory(concate);
//        	return condition;
//        }
//
//        private ConditionMenu createConditionMenu(String name, Condition condition){
//            ConditionMenu conditionMenu = new ConditionMenu();
////            conditionMenu.setId(id);
//            conditionMenu.setName(name);
//            conditionMenu.setCondition(condition);
//            return conditionMenu;
//        }
//
//        private CrossMenu createCrossMenu(String name) {
//            CrossMenu crossMenu = new CrossMenu();
//            crossMenu.setName(name);
//            return crossMenu;
//        }
//
//
//    }
//}
//
