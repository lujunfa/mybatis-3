package org.apache.ibatis.mybatisTest;

public interface RoleMapper {
    public test.mybatisTest.Role getRole(Long id);
    public test.mybatisTest.Role findRole(String roleName);
    public int deleteRole(Long id);
    public int insertRole(test.mybatisTest.Role role);
}