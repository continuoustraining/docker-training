FROM ruby:2.6
# Add a script to be executed every time the container starts.
# Start the main process.
RUN apt-get update -qq && apt-get install -y nodejs postgresql-client nginx
WORKDIR /myapp
COPY Gemfile .
COPY Gemfile.lock .
RUN bundle install
COPY . .
COPY ./docker/nginx-app.conf /etc/nginx/nginx.conf
# Add a script to be executed every time the container starts.
COPY ./docker/entrypoint.sh /usr/bin/
RUN chmod +x /usr/bin/entrypoint.sh
ENTRYPOINT ["entrypoint.sh"]
EXPOSE 3000

# Start the main process.
CMD ["rails", "server", "-b", "0.0.0.0"]
