FROM ruby:2.6
# Add a script to be executed every time the container starts.
# Start the main process.
RUN apt-get update -qq && apt-get install -y nodejs postgresql-client
WORKDIR /myapp
COPY ./src ./
RUN bundle install
# Add a script to be executed every time the container starts.
EXPOSE 3000
# All our commands will be prefixed by bundle exec, typical need of an entrypoint
ENTRYPOINT ["bundle", "exec"]
# Start the main process.
CMD ["bundle", "exec", "rails", "server", "-b", "0.0.0.0"]
