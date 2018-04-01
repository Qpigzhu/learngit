"""
    微信机检测好友
    2018/3/27
"""
from wxpy import *
import time
import json


def c_group(bot):
    """
    创建一个群
    """
    friends = bot.friends()
    creates = bot.create_group(friends[:3],topic='检测agg')
    print(creates)
    groups_creates = bot.groups().search('检测agg')
    create = groups_creates[0]
    for i in friends[1:4]:
         if i in create:
            create.remove_members(i)

def main():
    bot = Bot(cache_path =True)
    c_group(bot)
    friends = bot.friends(update=True)


    groups = bot.groups().search('检测agg')
    group = groups[0]
    data = {}
    num = 0
    msg = ''

    if len(groups)<1:
        print('不存在检测群')
        exit()


    for f in friends[1:3]:
        nick = f.raw['NickName']
        num = num + 1

        if f not in group:
            try:
                group.add_members(f)
            except Exception as e:
                print(str(e))

                if str(e) not in data:
                    data[str(e)] = []
                data[str[e]].append(nick)
        time.sleep(5)
        if f in group:
            print('successed!\t{}'.format(nick))
            group.remove_members(f)
        else:
            print('failed!\t%s' % nick)


    if len(data)>0:
        msg = ("联系人共{}个，本次检测了{}个，如下需确定认:\n{}".format(len(friends)-1),num,json.dumps(data,ensure_ascii=False))
    else:
        msg = ("联系人共%s个，本次检测了%s个，全部正常！"%(len(friends)-1,num))

    bot.file_helper.send(msg)
    print(msg)


if __name__ == '__main__':
    main()

