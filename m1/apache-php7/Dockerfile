FROM php:7.2-apache
# Set default system timezone

RUN ln -sf /usr/share/zoneinfo/Europe/Paris /etc/localtime
# Install last update and php extension

RUN apt-get update && apt-get install -y \
   git \
   bzip2 \
   zip \
   libbz2-dev \
   libicu-dev \
   && docker-php-ext-configure mysqli \
   && docker-php-ext-install mysqli pdo_mysql bz2 intl \
   && apt-get clean

# Enable Apache Rewrite module
RUN a2enmod rewrite

# Default Vhost for development
COPY vhost.conf /etc/apache2/sites-available/000-default.conf

#Install composer
RUN curl -sS https://getcomposer.org/installer | php \
	&& mv composer.phar /usr/bin/composer

CMD ["apache2-foreground"]
