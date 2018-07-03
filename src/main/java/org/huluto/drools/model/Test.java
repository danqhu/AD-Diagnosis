package org.huluto.drools.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class Test {

	public void testRules() {
        // 构建KieServices
        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        // 获取kmodule.xml中配置中名称为ksession-rule的session，默认为有状态的。
        KieSession kSession = kieContainer.newKieSession("ksession-rule");

        Person person = new Person("Macheal", 38, Person.TrueOrFalse.True, Person.TrueOrFalse.True);

        kSession.insert(person);
        kSession.getAgenda().getAgendaGroup("group1").setFocus();
        int count = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group2").setFocus();
        int count2 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group3").setFocus();
        int count3 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group4").setFocus();
        int count4 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group5").setFocus();
        int count5 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group6").setFocus();
        int count6 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group7").setFocus();
        int count7 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group8").setFocus();
        int count8 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group9").setFocus();
        int count9 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group10").setFocus();
        int count10 = kSession.fireAllRules();
        kSession.getAgenda().getAgendaGroup("group11").setFocus();
        int count11 = kSession.fireAllRules();
        System.out.println("group1 命中了" + count + "条规则！");
        System.out.println("group2 命中了" + count2 + "条规则！");
        System.out.println("group3 命中了" + count3 + "条规则！");
        System.out.println(person.getADResult());

    }
	
	public static void main(String[] args) {
		Test t = new Test();
		t.testRules();
	}
}
