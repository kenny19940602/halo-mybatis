package com.halo.mbg.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Users users = new Users();

    public static final SqlColumn<Integer> id = users.id;

    public static final SqlColumn<Date> createTime = users.createTime;

    public static final SqlColumn<Date> updateTime = users.updateTime;

    public static final SqlColumn<String> avatar = users.avatar;

    public static final SqlColumn<String> description = users.description;

    public static final SqlColumn<String> email = users.email;

    public static final SqlColumn<Date> expireTime = users.expireTime;

    public static final SqlColumn<String> mfaKey = users.mfaKey;

    public static final SqlColumn<Integer> mfaType = users.mfaType;

    public static final SqlColumn<String> nickname = users.nickname;

    public static final SqlColumn<String> password = users.password;

    public static final SqlColumn<String> username = users.username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Users extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("create_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> updateTime = column("update_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> avatar = column("avatar", JDBCType.VARCHAR);

        public final SqlColumn<String> description = column("description", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("email", JDBCType.VARCHAR);

        public final SqlColumn<Date> expireTime = column("expire_time", JDBCType.TIMESTAMP);

        public final SqlColumn<String> mfaKey = column("mfa_key", JDBCType.VARCHAR);

        public final SqlColumn<Integer> mfaType = column("mfa_type", JDBCType.INTEGER);

        public final SqlColumn<String> nickname = column("nickname", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> username = column("username", JDBCType.VARCHAR);

        public Users() {
            super("users");
        }
    }
}