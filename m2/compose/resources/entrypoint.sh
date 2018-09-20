#!/bin/bash
set -e

if [ -d /mnt/applications ]
then
    chown -R www-data:www-data /mnt/applications
fi

exec "$@"
