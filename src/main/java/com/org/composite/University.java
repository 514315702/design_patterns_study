package com.org.composite;

import java.util.ArrayList;
import java.util.List;

public class University  extends OrganizationComponent{


    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();



    public University(String name, String descibe) {
        super(name, descibe);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescibe() {
        return super.getDescibe();
    }

    /**
     * 输入包含的学院
     */
    @Override
    public void print() {
        System.out.println("--------------"+getName()+"----------------");
        for (OrganizationComponent organizationComponent:organizationComponents){
            organizationComponent.print();
        }
    }
}
