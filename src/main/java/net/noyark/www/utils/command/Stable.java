package net.noyark.www.utils.command;

import net.noyark.www.utils.api.Connector;

public class Stable extends ConnectorCommand {

    public Stable(Connector connector) {
        super(connector);
    }

    @Override
    public Object execute(String[] args) {
        connector.setTable(args[0]);
        return "设置成功"+args[0];
    }

    @Override
    public String[] usage() {
        return new String[]{"设置连接的表","table_name 表名"};
    }
}
