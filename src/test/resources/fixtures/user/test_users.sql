INSERT
    INTO
        user_account(
            id,
            username,
            email,
            password,
            roles,
            enabled
        )
    VALUES(
        '988f02fd-c931-45df-9187-af33ee64f4ec'::uuid,
        'test1',
        'test1@test.com',
        '{noop}test1',
        '{ROLE_A,ROLE_B}',
        TRUE
    ),
    (
        '7ae9393a-fea0-42c4-8e6d-0f566e691d81'::uuid,
        'test2',
        'test2@test.com',
        '{noop}test2',
        NULL,
        FALSE
    ),
    (
        '0ac07687-a759-4311-bb19-5e39c21483a3'::uuid,
        'test3',
        'test3@test.com',
        '{noop}test3',
        '{ROLE_C}',
        TRUE
    ) ON
    CONFLICT DO NOTHING;