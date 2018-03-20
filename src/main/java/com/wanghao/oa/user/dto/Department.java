package com.wanghao.oa.user.dto;

import java.util.Set;

public class Department {
    private Integer dpId;
    private String dpName;
    private Set<User> userSet;
    private Set<Role> roleSet;

    @Override
    public String toString() {
        return "Department{" +
                "dpId=" + dpId +
                ", dpName='" + dpName + '\'' +
                ", userSet=" + userSet +
                ", roleSet=" + roleSet +
                '}';
    }

    public Integer getDpId() {
        return dpId;
    }

    public void setDpId(Integer dpId) {
        this.dpId = dpId;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
