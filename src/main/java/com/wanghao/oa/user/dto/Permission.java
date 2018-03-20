package com.wanghao.oa.user.dto;

import java.util.Set;

public class Permission {
    private Integer pmsnId;
    private String pmsnName;
    private Set<Role> roleSet;

    @Override
    public String toString() {
        return "Permission{" +
                "pmsnId=" + pmsnId +
                ", pmsnName='" + pmsnName + '\'' +
                ", roleSet=" + roleSet +
                '}';
    }

    public Integer getPmsnId() {
        return pmsnId;
    }

    public void setPmsnId(Integer pmsnId) {
        this.pmsnId = pmsnId;
    }

    public String getPmsnName() {
        return pmsnName;
    }

    public void setPmsnName(String pmsnName) {
        this.pmsnName = pmsnName;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }
}
