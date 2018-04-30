# AGYNAMIX website

Using cryogen to build: https://github.com/cryogen-project/cryogen

Prerequisites:

- sudo `apt-get install ruby1.9.1-dev`
- Sass: `sudo su -c "gem install sass"`
- Compass: `sudo su -c "gem install compass"` (build native extensions)

- run local server: `lein ring server`
- build all pages: `lein run`

## Install

- Run `shipIt.sh`
- On the server:
  - `sudo -s`
  - go to `/var/www/agynamix.de/html`
  - run `/home/tuhlmann/ship/extract.sh`
  - `cd ..`
  - `sudo chown -R www-data:www-data html`
  - `sudo service apache2 reload`
