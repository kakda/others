<?php

$users_array = array(
    array(
        'id' => 1,
        'powerline_users' => array(2, 3, 4),
        'passup_users' => array(5, 6, 7),
        'type' => 'platinum'
    ),
    array(
        'id' => 2,
        'powerline_users' => array(20, 30, 40),
        'passup_users' => array(50, 60, 70),
        'type' => 'gold'
    ),
    array(
        'id' => 3,
        'powerline_users' => array(80, 90, 100),
        'passup_users' => array(11, 21, 31),
        'type' => 'silver'
    ),
    array(
        'id' => 4,
        'powerline_users' => array(41, 51, 61),
        'passup_users' => array(71, 81, 91),
        'type' => 'bronze'
    ),
    array(
        'id' => 5,
        'powerline_users' => array(55, 65),
        'passup_users' => array(45, 35, 25),
        'type' => 'silver'
    ),
    array(
        'id' => 6,
        'powerline_users' => array(33, 43),
        'passup_users' => array(53, 63, 73),
        'type' => 'gold'
    ),
    array(
        'id' => 7,
        'powerline_users' => array(44, 54),
        'passup_users' => array(64, 74),
        'type' => 'bronze'
    ),
    array(
        'id' => 8,
        'powerline_users' => array(10, 57),
        'passup_users' => array(58, 59),
        'type' => 'platinum'
    ),
);

echo json_encode($users_array);